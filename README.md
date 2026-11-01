# itk.academy | count of elements

## Задание

Напишите метод, который получает на вход массив элементов и возвращает Map,
где ключи - элементы, а значения - сколько раз встретился этот элемент.

## Решение countOfElements

```java

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Tom", "jerry", "bob", "jerry", "bob", "jerry");

        Map<String, Integer> map = Arrays.countOfElements(list);
        
        if (map.get("bob") == 2) {
            System.out.println("OK");
        }
    }
}
```