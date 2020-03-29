package pattern.adaptee.twowayadaptee;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-29 22:22
 **/
public class Translate implements China, English{

    private China china;

    private English english;

    public Translate(English english) {
        this.english = english;
    }

    public Translate(China china) {
        this.china = china;
    }

    @Override
    public void getC() {
        english.getE();
    }

    @Override
    public void getE() {

        china.getC();
    }
}
