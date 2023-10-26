import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private List<Notebook> notebooks;

    // Конструктор класса
    public Controller() {
        notebooks = new ArrayList<>();
    }
    
    // Метод для добавления ноутбуков в множество
    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    // Метод для фильтрации ноутбуков по бренду
    public List<Notebook> filterNotebooksByBrand(String brand) {
        return notebooks.stream()
                .filter(notebook -> notebook.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    // Метод для сортировки ноутбуков по цене
    public List<Notebook> sortNotebooksByPrice() {
        List<Notebook> sortedList = new ArrayList<>(notebooks);
        Collections.sort(sortedList, (n1, n2) -> Double.compare(n1.getPrice(), n2.getPrice()));
        return sortedList;
    }
}
