package buttons;

public class WindowsButton implements Button{
    /**
     * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
     *
     * Это вариант кнопки под Windows.
     */
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
