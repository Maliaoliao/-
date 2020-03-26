package camera;
import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.image.BufferedImage;

import java.io.File;

import java.io.IOException;



import javax.imageio.ImageIO;

import javax.swing.JButton;



import org.bytedeco.javacpp.opencv_core.IplImage;

import org.bytedeco.javacv.CanvasFrame;

import org.bytedeco.javacv.Frame;

import org.bytedeco.javacv.Java2DFrameConverter;

import org.bytedeco.javacv.OpenCVFrameConverter;

import org.bytedeco.javacv.OpenCVFrameGrabber;





public class CameraUtil{

    private static CamerThread camerThread = null ;

    public static void main(String[] args) throws Exception, InterruptedException{

        Camera("/Users/maliao/app/a.jpg", 700, 700);



    }

    /*

     *  outFile 存储地址  列如 E:\\test\\2.jpg

     *  width   height 窗口大小  自己设置一下

     */

    public static void Camera(final String outFile, int width , final int height) {



        final OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);

        grabber.setImageWidth(width);

        grabber.setImageHeight(height);



        final CanvasFrame canvas = new CanvasFrame("摄像头");//新建一个窗口

        canvas.setAlwaysOnTop(true);

        canvas.setLayout(null);

        Font font= new Font("微软雅黑", Font.BOLD, 30);

        JButton jButton = new JButton("确认上传");

        final JButton jButton1 = new JButton("继续拍照");

        jButton1.setEnabled(false);

        JButton jButton2 = new JButton("关闭");

        jButton.setFont(font);

        jButton1.setFont(font);

        jButton2.setFont(font);

        jButton.setBounds(30, 550, 200, 100);

        jButton1.setBounds(260, 550, 200, 100);

        jButton2.setBounds(480, 550,200, 100);

        canvas.add(jButton);

        canvas.add(jButton1);

        canvas.add(jButton2);



        jButton.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                if(camerThread!=null) {

                    camerThread.terminate();

                }

                jButton1.setEnabled(true);

            }

        });



        jButton1.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                jButton1.setEnabled(false);

                camerThread = new CamerThread(height, height, canvas, grabber, outFile);

                camerThread.start();





            }

        });

        jButton2.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                camerThread.terminate();

                //System.exit(0);//退出

                canvas.dispose();

            }

        });

        camerThread = new CamerThread(height, height, canvas, grabber, outFile);

        camerThread.start();



    }

    public static void doExecuteFrame(Frame f, String targetFileName) {



        if (null ==f ||null ==f.image) {

            return;

        }

        Java2DFrameConverter converter =new Java2DFrameConverter();

        targetFileName=targetFileName.replace("mp4", "jpg");

        System.out.println("targetFileName"+targetFileName);

        String imageMat ="jpg";

        String FileName =targetFileName;

        BufferedImage bi =converter.getBufferedImage(f);

        File output =new File(FileName);

        try {

            ImageIO.write(bi,imageMat,output);

        }catch (IOException e) {

            e.printStackTrace();

        }

    }

}

class CamerThread extends Thread{

// 此变量必须加上volatile

    private volatile boolean stop = true;

    private int width;

    private int height;

    private CanvasFrame canvas;

    private OpenCVFrameGrabber grabber;

    private String  outFile;



    public CamerThread(int width, int height, CanvasFrame canvas, OpenCVFrameGrabber grabber, String outFile) {

        super();

        this.width = width;

        this.height = height;

        this.canvas = canvas;

        this.grabber = grabber;

        this.outFile = outFile;

    }





    @Override

    public void run() {

        int i=0;

        try {

            //
            grabber.start();   //开始获取摄像头数据

            while(stop){

                if(i<2) {

                    canvas.setSize(width, height);

                    i++;

                }

                canvas.showImage(grabber.grab());

                Thread.sleep(100);//50毫秒刷新一次图像

//获取摄像头图像并放到窗口上显示， 这里的Frame frame=grabber.grab(); frame是一帧视频图像

            }

            OpenCVFrameConverter.ToIplImage converter =new OpenCVFrameConverter.ToIplImage();

            IplImage src = null;

            Frame capturedFrame = null;

            capturedFrame= grabber.grab();

            src =converter.convert(capturedFrame);

            capturedFrame =converter.convert(src);

            CameraUtil.doExecuteFrame(grabber.grab(),outFile);

            grabber.stop();//停止抓取

        } catch (Exception e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }

    }







// 线程终止

    public void terminate() {

        stop = false;

    }

}