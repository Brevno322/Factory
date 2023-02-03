package buttons;

public class MacOSButton implements Button{
    /**
     * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
     *
     * Это вариант кнопки под MacOS.
     */
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
