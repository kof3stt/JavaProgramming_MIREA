public class Shape {
}
/*
Билет 1: Напишите метод под названием alternate, который принимает два списка целых чисел в качестве параметров и возвращает новый список, содержащий чередующиеся элементы из двух списков, в следующем порядке: Первый элемент из первого списка Первый элемент из второго списка Второй элемент из первого списка Второй элемент из второго списка Третий элемент из первого списка Третий элемент из второго списка Если списки не содержат одинаковое количество элементов, оставшиеся элементы из более длинного списка должны быть расположены последовательно в конце. Например, для первого списка (1, 2, 3, 4, 5) и второго списка (6, 7, 8, 9, 10, 11, 12) вызов alternate (listl, list2) должен вернуть список, содержащий (1, 6, 2, 7, 3, 8, 4, 9.5, 10, 11, 12). Не изменяйте передаваемые списки параметров.
package ticket1;

import java.util.*;

class Ticket1 {
    public static List<Integer> alternate(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();

        if (l1.isEmpty() && l2.isEmpty()) {
            return result;
        }

        if (l1.size() == l2.size()) {
            for (int i = 0; i < l1.size(); ++i) {
                result.add(l1.get(i));
                result.add(l2.get(i));
            }
        } else if (l1.size() > l2.size()) {
            int i = 0;
            for (; i < l2.size(); ++i) {
                result.add(l1.get(i));
                result.add(l2.get(i));
            }
            for (; i < l1.size(); ++i) {
                result.add(l1.get(i));
            }
        } else {
            int i = 0;
            for (; i < l1.size(); ++i) {
                result.add(l1.get(i));
                result.add(l2.get(i));
            }
            for (; i < l2.size(); ++i) {
                result.add(l2.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        for (var item : alternate(l1, l2))
            System.out.print(item + " ");
    }
}

Билет 2: Напишите метод reverse, который принимает Мар от целых чисел к строкам в качестве параметра и возвращает новый Мар из строк к целым числам, который является «зеркальным отображением» оригинальной структуры. Риверс исходного Мар определяется здесь как новый Мар, который использует значения из оригинала в качестве своих ключей и ключи от оригинала в качестве своих значений. Поскольку значения Мар не обязательно должны быть уникальными, а его ключи обязательно должны быть уникальными, допустимо иметь любой из исходных ключей в результате в качестве значения. Другими словами, если исходный словарь имеет пары (k1, v) и (k2, v), то новый словарь должен содержать либо пару (v, k1), либо (v, k2).
import java.util.*;

class Ticket2 {
    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();

        for (var item : map.keySet()) {
            result.put(map.get(item), item);
        }

        return result;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");

        Map<String, Integer> newMap = reverse(hashMap);

        for (var item : newMap.keySet()) {
            System.out.println(item + " " + newMap.get(item));
        }
    }
}

Билет 3: Напишите метод isUnique, который принимает Мар <string, string> в качестве параметра и возвращает true, если никакие два ключа не отображаются на одно и то же значение (и false, если любые два или более ключа соответствуют одному и тому же значению). Например, вызов вашего метода на следующем словаре вернет {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins} Вызов его на следующем словаре вернул бы false из-за двух отображений для Perkins и Reges: {Kendrick=Perkins, Stuart-Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins} Пустой словарь считается уникальным, поэтому ваш метод должен возвращать true, если передается пустой словарь.
import java.util.*;

class Ticket3 {
    public static boolean isUnique(Map<String, String> map) {
        Set<String> uniqueValues = new HashSet<>();

        for (var value : map.values())
            if (!uniqueValues.add(value))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Map<String, String> exampleMap = new HashMap<>();
        exampleMap.put("key1", "value1");
        exampleMap.put("key2", "value2");
        exampleMap.put("key3", "value3");

        System.out.println(isUnique(exampleMap));
    }
}

Билет 4: Напишите метод hasOdd, который принимает множество (Set) целых чисел в качестве параметра и возвращает true, если набор содержит хотя бы одно нечетное целое число, и false в противном случае. Если передано пустое множество, ваш метод должен вернуть false.
import java.util.*;

class Ticket4 {
    public static boolean hasOdd(Set<Integer> set) {
        if (set.isEmpty())
            return false;

        for (var item : set)
            if (item % 2 != 0)
                return true;

        return false;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 6));
        Set<Integer> set3 = new HashSet<>();

        System.out.println(hasOdd(set1));
        System.out.println(hasOdd(set2));
        System.out.println(hasOdd(set3));
    }
}

Билет 5: Напишите метод rarest, который принимает Мар, ключи которого являются строками, а значения являются целыми числами, в качестве параметра. Метод возвращает целочисленное значение, которое встречается в словаре наименьшее количество раз. Если словарь не пуст, то верните меньшее целочисленное значение. Если словарь пуст, сгенерируйте исключение. Например, предположим, что словарь содержит сопоставления имен студентов(строки) и их возраста (целые числа). Ваш метод вернет наименее часто встречающийся возраст. Рассмотрим переменную словаря м. содержащую следующие пары ключ/значение: (Alyssa=22, Char=25, Dan-25, Jeff-20, Kasey 20, Kim-20, Mogran-25, Ryan=25, Stef-22) Три человека имеют возраст 20 лет (Джефф. Кейси и Ким), и два человека - 22 года (Алисса и Стеф), и четыре человека - 25 лет (Чар, Дэн, Могран и Райан). Таким образом, сетод rarest (м) возвращает 22, потому что только два человека имеют этот возраст.
import java.util.*;

class Ticket5 {
    private static int count(List<Integer> list, int target) {
        int c = 0;

        for (var item : list)
            if (item == target)
                ++c;

        return c;
    }

    public static int rarest(Map<String, Integer> map) throws Exception {
        if (map.isEmpty()) {
            throw new Exception("Empty");
        }

        List<Integer> list = new ArrayList<>(map.values());

        int minCount = Integer.MAX_VALUE;
        int rarestValue = 0;

        for (int i = 0; i < list.size(); ++i) {
            int currentCount = count(list, list.get(i));

            if (currentCount < minCount) {
                minCount = currentCount;
                rarestValue = list.get(i);
            }
        }
        return rarestValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("skibidi", 4);
        map.put("rizz", 4);
        map.put("kai cenat", 6);
        map.put("ohio", 7);
        map.put("gyat", 7);

        try {
            System.out.println(rarest(map));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

Билет 6: Напишите метод с именем guavaSort, который принимает массив строк в качестве параметра и упорядочивает строки в массиве в отсортированном порядке возрастания. В частности, ваш алгоритм сортировки должен использовать FJC для Multiset или Multimap для реализации варианта алгоритма блочной сортировки, который будет работать со строками. Используйте коллекцию FJC для подсчета вхождений строк, аналогично тому, как это делается в блочной сортировке, а затем поместите эти строки обратно в массив отсортированном порядке. Например, предположим, что вашему методу передается следующий массив: [Farm, Zoo, Car, Apple, Bee, Golf, Bee, Dog, Golf, Zoo, Zoo, Bee, Bee, Apple] Ваша коллекция должна хранить следующие вхождения строк: [Apple x 2, Bee x 4, Car, Dog, Farm, Golf x 2, Zoo x 3] B Что вы должны использовать, чтобы поместить строки обратно в массив в отсортированном порядке: [Apple, Apple, Bee, Bee, Bee, Bee, Car, Dog, Farm, Golf, Golf, Zoo, Zoo, Zoo] Ваш код должен выполняться за время O (N log N) и использовать память О (N), где N - количество элементов в массиве. Вы можете предположить, что переданный массив и все строки в нем не равны нулю. Не используйте никаких других вспомогательных коллекций, кроме одного Multiset или Multimap.

private static String[] guavaSort(String[] source) {
        Multiset<String> multiset = TreeMultiset.create();
        multiset.addAll(Arrays.asList(source));
        String[] dest = new String[source.length];
        int i = 0;
        for (String element : multiset) {
            int count = multiset.count(element);
            for (int j = 0; j < count; j++) {
                System.out.println(element + ", " + count);
                dest[i + j] = element;
            }
            multiset.setCount(element, 0);
            i += count;
        }
        return dest;
    }

Билет 7: Напишите метод removeAll, который можно добавить в класс LinkedIntList. Метод должен эффективно удалить из отсортированного списка целых чисел все значения, появляющиеся во втором отсортированном списке целых чисел. Например, предположим, что переменные LinkedIntList list1 и list2 ссылаются на следующие списки: listl: [1, 3, 5, 7] list2: [1, 2, 3, 4, 5] Если была вызвана list1.removeAll (list2); то, списки должны хранить следующие значения после вызова: list]: [7] list2: [1, 2, 3, 4, 5] Обратите внимание, что все значения из listl, которые появляются в list2, были удалены, а list2 не изменился. Если бы вместо этого был вызов list2.removeAll (list1); списки будут иметь следующие значения: list1: [1, 3, 5, 7] list2: [2,4] Оба списка гарантированно находятся в отсортированном (неубывающем) порядке, хотя в любом списке могут быть дубликаты. Поскольку списки отсортированы, вы можете решить эту проблему очень эффективно за один проход данных. Ваше решение должно выполняться за время О (М + N), где М и N - длины двух списков. Предположим, что мы добавляем этот метод в класс LinkedIntList, как показано ниже. Вы не можете вызывать какие-либо другие методы класса для решения этой задачи, вы не можете создавать новые узлы и не можете использовать какие-либо вспомогательные структуры данных для решения этой проблемы (например, массив, ArrayList, Queue, String и т. Д.). Вы также не можете изменять какие-либо поля данных узлов. Вы должны решить эту задачу, переставив ссылки на списки. public class LinkedIntList { private ListNode front; } } public class ListNode { public int data; public ListNode next;
package ticket7;
class LinkedInList {
    private ListNode first;

    public void removeAll(LinkedInList list2) {
        ListNode curList1 = first;
        ListNode curList2 = list2.first;
        ListNode previous = null;

        while (curList1 != null && curList2 != null) {
            if (curList1.val == curList2.val) {
                if (previous == null) {
                    first = curList1.next;
                    curList1 = first;
                } else {
                    previous.next = curList1.next;
                    curList1 = curList1.next;
                }
            } else if (curList1.val < curList2.val) {
                previous = curList1;
                curList1 = curList1.next;
            } else {
                curList2 = curList2.next;
            }
        }
    }

    public void addToList(int val) {
        ListNode listNode = new ListNode(val);
        ListNode last = first;
        if (first == null) {
            first = listNode;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = listNode;
        }

    }

    public void printList() {
        ListNode current = first;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedInList linkedIntList1 = new LinkedInList();
        LinkedInList linkedIntList2 = new LinkedInList();
        linkedIntList1.addToList(1);
        linkedIntList1.addToList(2);
        linkedIntList1.addToList(3);
        linkedIntList1.addToList(4);
        linkedIntList2.addToList(1);
        linkedIntList2.addToList(2);
        linkedIntList2.addToList(5);
        linkedIntList2.addToList(6);
        linkedIntList1.printList();
        linkedIntList2.printList();
        linkedIntList1.removeAll(linkedIntList2);
        linkedIntList1.printList();


    }
}

package ticket7;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

Билет 9: Напишите метод removeDuplicates, который можно добавить в класс LinkedIntList. Метод должен удалить любые дубликаты из связанного списка целых чисел. Результирующий список должен иметь значения в том же относительном порядке, что и их первое вхождение в исходном списке. Другими словами, значение і должно появляться перед значением и в окончательном списке тогда и только тогда, когда первое вхождение і появилось до первого появления j в исходном списке. Например, если переменная с именем list хранит следующий список: [14, 8, 14, 12, 1, 14, 11, 8, 8, 10, 4, 9, 1, 2, 5, 2, 4, 12, 12] После вызова list.removeDuplicates (); список должен хранить эти значения в таком виде: [14, 8, 12, 1, 11, 10, 4, 9, 2, 5] Предположим, что мы добавляем этот метод в класс LinkedIntList, как показано ниже. Вы не можете вызывать какие-либо другие методы класса для решения этойзадачи, вы не можете создавать новые узлы и не можете использовать какие-либо вспомогательные структуры данных для решения этой проблемы (например, массив, ArrayList, Queue, String и т. д.). Вы также не можете изменять какие-либо поля данных узлов. Вы должны решить этузадачу, переставив ссылки в списке. public class LinkedIntList { } private ListNode front; public class ListNode { public int data; public ListNode next; }
package ticket9;

class LinkedInList {
   ListNode first;

    public void removeDuplicates() {
        ListNode current = first;
        while (current != null) {
            ListNode prev = current;
            ListNode helper = current.next;

            while (helper != null) {
                if (helper.val == current.val) {
                    prev.next = helper.next;
                } else {
                    prev = helper;
                }
                helper = helper.next;
            }
            current = current.next;
        }
    }


    public void addToList(int val) {
       ListNode listNode = new ListNode(val);
       ListNode last = first;
        if (first == null) {
            first = listNode;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = listNode;
        }

    }

    public void printList() {
       ListNode current = first;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedInList linkedIntList1 = new LinkedInList();
        linkedIntList1.addToList(14);
        linkedIntList1.addToList(8);
        linkedIntList1.addToList(14);
        linkedIntList1.addToList(12);
        linkedIntList1.addToList(1);
        linkedIntList1.addToList(14);
        linkedIntList1.addToList(11);
        linkedIntList1.addToList(8);
        linkedIntList1.addToList(8);
        linkedIntList1.addToList(10);
        linkedIntList1.addToList(4);
        linkedIntList1.addToList(9);
        linkedIntList1.addToList(1);
        linkedIntList1.addToList(2);
        linkedIntList1.addToList(5);
        linkedIntList1.addToList(2);
        linkedIntList1.addToList(4);
        linkedIntList1.addToList(12);
        linkedIntList1.addToList(12);
        linkedIntList1.printList();
        linkedIntList1.removeDuplicates();
        linkedIntList1.printList();
    }
}
package ticket9;

class ListNode {
    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

Напишите

Билет 11: Напишите метод firstLast, который можно добавить в класс LinkedIntList, который перемещает первый элемент списка в конец списка. Предположим, что переменная LinkedIntList с именем list хранит следующие элементы спереди (слева) и сзади (справа): [18, 4, 27, 9, 54, 5, 63] Если вы сделали вызов list. firstLast ();, список будет хранить элементы в следующем порядке: [4, 27, 9, 54, 5, 63, 18] Если список пуст или содержит только один элемент, его содержимое не должно изменяться. Соблюдайте следующие ограничения в вашем решении: Не вызывайте никакие другие методы объекта LinkedIntList, такие как add, remove или size. Не создавайте новые объекты ListNode (хотя у вас может быть столько переменных ListNode, сколько вам нужно). Не используйте другие структуры данных, такие как массивы, списки, очереди и т. д. Не изменяйте данные любого существующего узла; изменять список только путем изменения ссылок между узлами. Ваше решение должно выполняться за время (N), где N количество элементов в связанном списке. Предположим, что вы добавляете этот метод в класс LinkedIntList (который использует класс ListNode) как показано ниже: public class LinkedIntList { public class ListNode { public int data; } public ListNode next;
package ticket11;

class LinkedIntList {
    private ListNode front;

    public void firstLast() {
        if (front == null || front.next == null) {
            return;
        }

        ListNode last = front;
        while (last.next != null) {
            last = last.next;
        }

        last.next = front;
        front = front.next;
        last.next.next = null;
    }

    public void display() {
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.front = new ListNode(18);
        list.front.next = new ListNode(4);
        list.front.next.next = new ListNode(27);
        list.front.next.next.next = new ListNode(9);
        list.front.next.next.next.next = new ListNode(54);
        list.front.next.next.next.next.next = new ListNode(5);
        list.front.next.next.next.next.next.next = new ListNode(63);

        System.out.println("Initial list:");
        list.display();

        list.firstLast();

        System.out.println("Result:");
        list.display();
    }
}

package ticket11;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}

Билет 14: Напишите метод equals, который принимает в качестве параметров два стека целых чисел, метод возвращает true, если два стека равны, и в противном случае возвращает false. Чтобы считаться равными, два стека должны хранить одинаковую последовательность целочисленных значений в одном и том же порядке. Ваш метод заключается в проверке двух стеков, но перед завершением работы метода необходимо вернуть их в исходное состояние. Вы можете использовать один стек в качестве вспомогательного хранения.
package ticket14;

import java.util.*;

class Ticket14 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        stack2.push(1);
        stack2.push(2);
        stack2.push(4);

        boolean result = equals(stack1, stack2);

        System.out.println("Equality: " + result);
    }

    static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.size() != stack2.size()) {
            return false;
        }

        Stack<Integer> tempStack = new Stack<>();

        while (!stack1.isEmpty()) {
            int value1 = stack1.pop();
            int value2 = stack2.pop();

            tempStack.push(value1);

            if (value1 != value2) {
                restoreStack(stack1, tempStack);
                restoreStack(stack2, tempStack);
                return false;
            }
        }

        restoreStack(stack1, tempStack);
        restoreStack(stack2, tempStack);

        return true;
    }

    static void restoreStack(Stack<Integer> original, Stack<Integer> temp) {
        while (!temp.isEmpty()) {
            original.push(temp.pop());
        }
    }
}

Билет 15: Напишите метод splitStack, который принимает стек целых чисел в качестве параметра и разбивает его на отрицательные и неотрицательные значения. Числа в стеке должны быть переставлены так, чтобы все отрицательные значения появлялись в нижней части стека, а все неотрицательные в верхней части. Другими словами, если после вызова этого метода вам нужно будет вытолкнуть числа из стека, вы сначала получите все неотрицательные числа, а затем получите все отрицательные числа. Неважно, в каком порядке появляются числа, если все отрицательные находятся в стеке всегда ниже, чем все неотрицательные числа. Вы можете использовать одну очередь в качестве вспомогательного хранения.
package ticket15;

import java.util.*;

class Ticket15 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(-5);
        stack.push(2);
        stack.push(-8);
        stack.push(4);
        stack.push(1);

        splitStack(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    static void splitStack(Stack<Integer> stack) {
        Stack<Integer> positiveStack = new Stack<>();
        Stack<Integer> negativeStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current < 0) {
                negativeStack.push(current);
            } else {
                positiveStack.push(current);
            }
        }

        while (!positiveStack.isEmpty()) {
            stack.push(positiveStack.pop());
        }
        while (!negativeStack.isEmpty()) {
            stack.push(negativeStack.pop());
        }
    }
}

Билет 15 (New): Напишите метод reverseHalf, который меняет порядок на половину элементов очереди целых чисел. Ваш метод должен изменить порядок всех элементов в нечетных позициях (позиции 1, 3, 5 и т.д.), помним, что первое значение в очереди имеет позицию 0. Например, если очередь изначально хранит эту последовательность числе, когда метод вызывается: index: 0 1 2 3 4 5 6 7 front [1, 8, 7, 2, 9, 18, 12, 0] back Очередь должна хранить следующие значения выполнения метода: index 0 1 2 3 4 5 6 7 front [1, 0, 7, 18, 9, 2, 12, 8] back Обратите внимание, что числа в четных позициях (позиции 0, 2, 4, 6) не сместились. Эта последовательности чисел по-прежнему: (1, 7, 9, 12). Но обратите внимание, что числа в нечетных позициях (позиции 1, 3, 5, 7) теперь в обратном порядке относительно оригинала. Другими словами, исходная подпоследовательность: (8, 2, 18, 0) — стала такой: (0, 18, 2, 8). Вы можете использовать стек в качестве вспомогательного хранения элементов.
package newticket15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Ticket15New {
    public static void reverseHalf(Queue<Integer> queue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        for (int i = 0; !queue.isEmpty(); i++) {
            if (i % 2 == 0) {
                evenQueue.offer(queue.poll());
            } else {
                oddQueue.offer(queue.poll());
            }
        }

        // Here we reverse the queue
        Stack<Integer> stack = new Stack<>();
        while (!oddQueue.isEmpty()) {
            stack.push(oddQueue.poll());
        }

        // Filling final queue
        while (!evenQueue.isEmpty() || !stack.isEmpty()) {
            if (!evenQueue.isEmpty()) {
                queue.offer(evenQueue.poll());
            }
            if (!stack.isEmpty()) {
                queue.offer(stack.pop());
            }
        }
    }

    public static void main(String[] args) {
        // Пример использования
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(8);
        queue.offer(7);
        queue.offer(2);
        queue.offer(9);
        queue.offer(18);
        queue.offer(12);
        queue.offer(0);

        System.out.println("Исходная очередь: " + queue);

        reverseHalf(queue);

        System.out.println("Измененная очередь: " + queue);
    }
}

Билет 16: Напишите метод copyStack, который принимает стек целых чисел в качестве параметра и возвращает копию оригинального стека (то есть новый стек с теми же значениями, что и у оригинала, сохраненный в том же порядке, что и оригинал). Ваш метод должен создать новый стек и заполнять его теми же значениями, которые хранятся в исходном стеке. Недопустимо возвращать тот же стек, переданный методу; Вы должны создать, заполнить и вернуть новый стек. Вы будете удалять значения из исходного стека, чтобы сделать копию, но вы должны быть уверены, что поместите их обратно в исходный стек в том же порядке, прежде чем завершите с ним работу. Другими словами, когда ваш метод будет выполнен, исходный стек должен быть восстановлен в неходное состояние, и вы вернете новый независимый стек, который находится в том же состоянии. Вы можете использовать одну очередь в качестве вспомогательного хранения.
package ticket16;
import java.util.Stack;

class Ticket16 {
    public Stack<Integer> copyStack(Stack<Integer> stack) {
        Stack<Integer> stackHelper = new Stack<>();
        Stack<Integer> stackFinal = new Stack<>();
        while(!stack.isEmpty()) {
            stackHelper.push(stack.pop());
        }
        while (!stackHelper.isEmpty()) {
            int element = stackHelper.pop();
            stack.push(element);
            stackFinal.push(element);
        }
        return stackFinal;
    }

    public static void main(String[] args) {
        Ticket16 stackManipulation = new Ticket16();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Stack<Integer> copiedStack = stackManipulation.copyStack(stack);
        System.out.println("origin stack");
        for(Integer element: stack) {
            System.out.print(element + " ");

        }
        System.out.println("\nstack after using copyStack");
        for(Integer element: copiedStack) {
            System.out.print(element + " ");
        }
//        System.out.println(stack); you can print it too
//        System.out.println(copiedStack);
    }

}

Новый билет 16: Класс Деньги для работы с денежными суммами. Число должно быть представлено двумя полями: типа long для рублей и типа double- для копеек. Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой. Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число, умножение на дробное число и операции сравнения. В классе Тестер проверить эти методы.
package newticket16;

class Money {
    private long rubles;
    private double kopecks;

    public Money(long rubles, double kopecks) {
        this.rubles = rubles;
        this.kopecks = kopecks;
    }

    public Money add(Money other) {
        return new Money(this.rubles + other.rubles, this.kopecks + other.kopecks);
    }

    public Money subtract(Money other) {
        return new Money(this.rubles - other.rubles, this.kopecks - other.kopecks);
    }

    public Money divide(long divisor) {
        return new Money(this.rubles / divisor, this.kopecks / divisor);
    }

    public Money divide(double divisor) {
        return new Money((long) (this.rubles / divisor), this.kopecks / divisor);
    }

    public Money multiply(double factor) {
        return new Money((long) (this.rubles * factor), this.kopecks * factor);
    }

    public boolean isEqual(Money other) {
        return this.rubles == other.rubles && this.kopecks == other.kopecks;
    }

    public boolean isGreater(Money other) {
        return this.rubles > other.rubles || (this.rubles == other.rubles && this.kopecks > other.kopecks);
    }

    public boolean isLess(Money other) {
        return this.rubles < other.rubles || (this.rubles == other.rubles && this.kopecks < other.kopecks);
    }

    @Override
    public String toString() {
        return rubles + "," + kopecks + " rub.";
    }
}

package newticket16;

class Tester {
    public static void main(String[] args) {
        Money money1 = new Money(10, 50.75);
        Money money2 = new Money(5, 25.50);

        Money sum = money1.add(money2);
        Money difference = money1.subtract(money2);
        Money division = money1.divide(2);
        Money divisionByFraction = money1.divide(2.5);
        Money multiplication = money1.multiply(1.5);

        System.out.println("Money 1: " + money1);

        System.out.println("Money 2: " + money2);

        System.out.println("Sum: " + sum);

        System.out.println("Difference: " + difference);

        System.out.println("Division by 2: " + division);

        System.out.println("Division by 2.5: " + divisionByFraction);

        System.out.println("Multiplication by 1.5: " + multiplication);

        System.out.println("Comparison: ");
        System.out.println("Is money1 equal to money2? " + money1.isEqual(money2));
        System.out.println("Is money1 greater than money2? " + money1.isGreater(money2));
        System.out.println("Is money1 less than money2? " + money1.isLess(money2));
    }
}

Билет 18: Напишите метод longestSortedSequence, который возвращает длину самой длинной отсортированной последовательности в списке целых чисел. Например, если переменная с именем list хранит следующую последовательность значений: [1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17] тогда вызов: list.longestSortedSequence () вернет значение 4, поскольку это длина самой длинной отсортированной последовательности в этом списке (последовательность -3, 0, 42, 308). Если список пуст, ваш метод должен вернуть 0. Обратите внимание, что для непустого списка метод всегда будет возвращать по крайней мере 1, потому что любой отдельный элемент составляет отсортированную значение последовательность. public class ArrayIntList { private int[] elementData; private int size; // your code goes here }
package ticket18;

class ArrayIntList {
    private int[] elementData;
    private int size;

    public void setElementData(int[] elementData) {
        this.elementData = elementData;
    }

    public int longestSortedSequence() {
        int longest = 0;
        int c = 1;

        for (int i = 0; i < elementData.length - 1; ++i) {
            if (elementData[i] <= elementData[i + 1]) {
                ++c;
            } else {
                if (c > longest) {
                    longest = c;
                }
                c = 1;
            }
        }

        if (c > longest) {
            longest = c;
        }
        return longest;
    }
}

package ticket18;

class Ticket18 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17};
        ArrayIntList ail = new ArrayIntList();
        ail.setElementData(arr);
        System.out.println(ail.longestSortedSequence());
    }

}

Билет 21: Напишите универсальный класс для реализации алгоритмов поиска. В качества параметров используйте массив интерфейсных ссылок
package ticket21;

// TODO: Do a code review
class SearchAlgorithm<T extends Comparable<T>> {
    private final T[] array;

    public SearchAlgorithm(T[] array) {
        this.array = array;
    }

    public int linearSearch(T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = array[mid].compareTo(key);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SearchAlgorithm<Integer> intSearch = new SearchAlgorithm<>(intArray);

        int key = 6; // index

        int linearResult = intSearch.linearSearch(key);
        System.out.println("Linear search result: " + linearResult);

        int binaryResult = intSearch.binarySearch(key);
        System.out.println("Binary search result: " + binaryResult);
    }
}

Билет 22: Напишите универсальный класс для реализации алгоритмов сортировок. В качества параметров используйте массив интерфейсных ссылок

package ticket22;

import java.util.Comparator;
import java.util.List;

class Sorter<T extends Number> implements Comparator<T> {
    public void bubbleSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(list.get(j), list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public int compare(T a, T b) {
        return Double.compare(a.doubleValue(), b.doubleValue());
    }

    public void quickSort(List<T> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private int partition(List<T> list , int low, int high) {
        T pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(list.get(j),pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(List<T> list, int i, int j) {
        var temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

package ticket22;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Sorter<Integer> integerSorter = new Sorter<>();
        List<Integer> list = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));
        integerSorter.bubbleSort(list);

        for (var item: list)
            System.out.print(item + " ");

        System.out.println();

        Sorter<Double> doubleSorter = new Sorter<> ();
        List<Double> list1 = new ArrayList<>(Arrays.asList(5.6, 4.5, 3.6, 2.2, 1.1));
        doubleSorter.quickSort(list1, 0, list1.size() - 1);

        for (var item: list1)
            System.out.print(item + " ");

        System.out.println();

        Sorter<Long> longSorter = new Sorter<>();
        List<Long> list2 = new Vector<>(Arrays.asList(5L, 4L, 3L, 2L, 1L));
        longSorter.quickSort(list2, 0, list1.size() - 1);

        for (var item: list2)
            System.out.print(item + " ");
    }
}

Билет 23: Разработайте класс иерархию классов Геометрическая фигура, Прямоугольник, Круг. Используйте паттерн Фабрика

interface IShape {
}

interface IAbstractShapeFactory {
    IShape createCircle();

    IShape createRectangle();
}

class ConcreteShapeFactory implements IAbstractShapeFactory {
    @Override
    public Circle createCircle() {
        return new Circle();
    }

    @Override
    public Rectangle createRectangle() {
        return new Rectangle();
    }
}

class Circle implements IShape {
}

class Rectangle implements IShape {
}

Билет 24: Разработайте класс иерархию классов Комплексное число, Рациональное число. Используйте паттерн Фабрика
class Complex implements MyNumber {
}

class ConcreteMyNumberFactory implements IAbstractMyNumberFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Rational createRational() {
        return new Rational();
    }
}

interface IAbstractMyNumberFactory {
    MyNumber createRational();

    MyNumber createComplex();
}

interface MyNumber {
}

class Rational implements MyNumber {
}

Билет 25: Напишите реализацию структуры данных Stack на списке
package ticket25;

import java.util.LinkedList;

class StackOnList<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        StackOnList<Integer> stack = new StackOnList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size: " + stack.size());
        System.out.println("Top: " + stack.peek());

        System.out.println("Popping:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

Билет 26: Напишите реализацию структуры ArrayList на списке
package ticket26;

import java.util.AbstractList;
import java.util.LinkedList;

class MyArrayList<T> extends AbstractList<T> {
    LinkedList<T> list = new LinkedList<>();

    @Override
    public T get(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(index);
    }
    @Override
    public int size() {
        return list.size();
    }

    public T set(int index, T element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return list.set(index, element);
    }
    @Override
    public boolean add(T t) {
        return list.add(t);
    }


    public void delete(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException();
        }
         list.remove(index);
    }

    public void print() {
        for (var item : list) {
            System.out.print(item + " ");
        }
    }
}

package ticket26;

class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("I'm sure");
        arrayList.add("we're");
        arrayList.add("taller");
        arrayList.add("in another");
        arrayList.add("dimension...");
        System.out.println("before removing: ");
        arrayList.print();
        arrayList.delete(4);
        System.out.println("\nafter removing: ");
        arrayList.print();

    }
}

Билет 27: Напишите реализацию структуры ArrayList на массиве.
package ticket27;

import java.util.Arrays;

class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private T[] data;
    private int size;

    public MyArrayList() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(T[] data) {
        this.data = Arrays.copyOf(data, data.length);
        this.size = data.length;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public void add(T newItem) {
        ensureCapacity();
        data[size++] = newItem;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        // Set the last element to null and decrease the size
        data[--size] = null;
    }

    public int search(T item) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}

Билет 28: Дано натуральное число N. Вычислите сумму его цифр. При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
package ticket28;

class Ticket28 {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int num = 1234567;
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " + sum);
    }
}

Билет 29: Напишите реализацию структуры данных Stack на массиве. При реализации необходимо использовать Дженерики
package ticket29;

import java.util.EmptyStackException;

class Ticket29 {
    public static class GenericArrayStack<E> {
        private static final int DEFAULT_CAPACITY = 10;

        private Object[] array;
        private int size;

        public GenericArrayStack() {
            this.array = new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }

        public void push(E element) {
            ensureCapacity();
            array[size++] = element;
        }

        public E pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            E element = peek();
            array[--size] = null;
            return element;
        }

        public E peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return (E) array[size - 1]; // TODO: try to fix unchecked cast
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        private void ensureCapacity() {
            if (size == array.length) {
                int newCapacity = array.length * 2;
                array = java.util.Arrays.copyOf(array, newCapacity);
            }
        }
    }

    public static void main(String[] args) {
        GenericArrayStack<Integer> stack = new GenericArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size of stack: " + stack.size());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Pop element: " + stack.pop());
        System.out.println("Pop element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

Билет 30: Задача на рекурсию: Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае. Операцией возведения в степень пользоваться нельзя!
package ticket30;

class Ticket30 {
    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        // If n = 1, it is 2^0 = 1, so return true
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPowerOfTwo;
        for (int i = 0; i < 10; i++) {
            int N = i; // For your convenience; redundant.
            isPowerOfTwo = checkPowerOfTwo(N);
            if (isPowerOfTwo) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

Запишите выходные данные, которые выводятся, когда указанному ниже методу передается каждый из следующих отображений в качестве параметра. Напомним, что содержимое печатается в формате ключ = значение. Ваш ответ должен отображать правильные ключи и значения в правильном порядке.
public static void mystery(Map<String, String> map) {
	Map<String, String> result = new TreeMap<String, String>();
	for (String key: map.keySet()) {
		if (key.compareTo(map.get(key)) < 0) {
			result.put(key, map.get(key));
		} else {
			result.put(map.get(key), key);
		}
	}
		System.out printin(result);
}
{two=deux, five=cinq, one=un, three=trois, four=quatre}
{skate=board, drive=car, program=computer, play=computer}
{siskel=ebert, girl=boy, heads=tails, ready=begin, first=last, begin=end}
{cotton=shirt, tree=violin, seed=tree, light=tree, rain=cotton}

Вывод:
{cinq=five, deux=two, four=quatre, one=un, three=trois}
{board=skate, car=drive, computer=program}
{cotton=rain, light=tree, seed=tree, tree=violin}
//Данный метод принимает в качестве параметра словарь. Далее проходится по ключам
//словаря и, если строка ключа меньше строки значения, то в новом словаре пара
//записывается в исходном виде (ключ-значение),если наоборот, то в новый в словарь
//добавляется экзмепляр, у которого ключем является значение этой пары, а значением ключ
//происходит вывод итогового словаря
//(метод compareTo упорядочивает строки в алфавитном порядке, лексикографически и с учетом регистра.)
//Тестовые данные:
mystery(new HashMap<>(Map.of("two", "deux", "five", "cinq", "one", "un", "three","trois", "four", "quatre")));
mystery(new HashMap<>(Map.of("skate", "board", "drive", "car", "program", "computer", "play","computer")));
mystery(new HashMap<>(Map.of("cotton", "shirt", "tree", "violin", "seed", "tree", "light","tree", "rain", "cotton")));

Напишите метод isPalindrome, который принимает в качестве параметра очередь целых чисел и возвращает true, если числа в очереди представляют палиндром (и false в противном случае). Последовательность чисел считается палиндромом, если она совпадает в обратном порядке. Например, предположим, что очередь с именем q хранит эти значения:
front [3, 8, 17, 9, 17, 8, 3] back
Тогда вызов isPalindrome (q); должен вернуть true, потому что эта последовательность одинакова в обратном порядке. Если в очереди хранятся эти значения:
front [3, 8, 17, 9, 4, 17, 8, 3] back
Вызов isPalindrome вместо этого вернул бы false, потому что эта последовательность не совпадает в обратном порядке (9 и 4 в середине не совпадают). Пустую очередь следует считать палиндромом. Вы не можете делать какие-либо предположения относительно количества элементов в очереди, и ваш метод должен восстановить очередь, после использования очередь, чтобы после вызова он сохранял ту же последовательность значений, что и раньше. Вы можете использовать стек в качестве вспомогательного хранения.

// 1 вариант
public static boolean isPalindrome(Queue<Integer> queue){
        int n = queue.size();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int el = queue.poll();
            stack.push(el);
            queue.add(el);
        }

        for(int i = 0; i < n; i++){
            int el = queue.poll();
            queue.add(el);
            if(el != stack.pop()){
                i++;
                for(; i < n; i++){
                    queue.add(queue.poll());
                }
                return false;
            }
        }
        return true;
    }
// 2 вариант
private static boolean isPalindrome(Queue<Integer> queue){
        Stack<Integer> stack =  new Stack<>();
        int size = queue.size();
        boolean check = true;

        if(queue.size() == 0) return true;
        for (int i =0; i < size; i++){
            Integer node = queue.poll();
            queue.offer(node);
            stack.add(node);
        }

        for (int i = 0; i < size; i++){
            Integer nodeQ = queue.poll();
            Integer nodeS = stack.pop();
            queue.offer(nodeQ);
            if (!nodeS.equals(nodeQ)) check = false;
        }
        System.out.println(queue);
        return check;
    }

Напишите метод equals2, который можно добавить в класс IntTree. Метод принимает другое двоичное дерево целых чисел как параметр и сравнивает два дерева, чтобы увидеть, равны ли они друг другу. Например, если переменные типа IntTree с именами t1 и t2 были инициализированы, то вызов t1.equals2 (t2) вернет true, если деревья равны, и false, если в противном случае.
Замечание: два дерева считаются равными, если они имеют одинаковую структуру и хранят одинаковые значения. Каждый узел в одном дереве должен иметь соответствующий узел в другом дереве в том же месте относительно корня и хранить то же значение. Два пустых дерева считаются равными друг другу.
Вы можете определить частные вспомогательные методы для решения этой проблемы, но в противном случае вы не можете вызывать какие-либо другие методы класса или создавать какие-либо структуры данных, такие как массивы, списки и т. д. Ваш метод не должен изменять структуру или содержимое любого из этих двух типов, деревья просто сравниваются.

public class IntTree {
	private InTreeNode root;
	...
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

//немного переделанное решение выше, надо проверить!!!
public class IntTree {
    private TreeNode root;

    public boolean equals2(IntTree node){
        return equals2(this.root, node.root);
    }
    public boolean equals2(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 != null && root2 != null){
            return root1.val == root2.val && equals2(root1.right, root2.right) && equals2(root1.left, root2.left);
        }
        return false;
    }
}
class  TreeNode{
    public int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(){};
    TreeNode(int val) {
        this.val = val;
    };
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}


Преобразование listnode...

import java.util.List;

public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode() {
    }
}




public class Main {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));

        printList(list1);
        }


    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

 */