public class View {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Notebook notebook1 = new Notebook("Lenovo", "ThinkPad", 1500.0, 8, 512);
        Notebook notebook2 = new Notebook("Apple", "MacBook Pro", 2000.0, 16, 512);
        Notebook notebook3 = new Notebook("Dell", "XPS", 1800.0, 16, 1);

        controller.addNotebook(notebook1);
        controller.addNotebook(notebook2);
        controller.addNotebook(notebook3);

        // Фильтрация ноутбуков по бренду "Dell"
        List<Notebook> filteredByBrand = controller.filterNotebooksByBrand("Dell");
        System.out.println("Ноутбуки бренда Dell:");
        for (Notebook notebook : filteredByBrand) {
            System.out.println(notebook.toString());
        }

        // Сортировка ноутбуков по цене
        List<Notebook> sortedByPrice = controller.sortNotebooksByPrice();
        System.out.println("\nНоутбуки, отсортированные по цене:");
        for (Notebook notebook : sortedByPrice);
     }}
           