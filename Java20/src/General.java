public class General <T,V,K>{
    T element;
    V value;
    K key;

    public General(T my_type, V value, K key) {
        this.element = my_type;
        this.value = value;
        this.key = key;
    }

    public T getMy_type() {
        return element;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void setMy_type(T my_type) {
        this.element = my_type;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "General{" +
                "element: Type = " + element.getClass() + ", value = " + element + ";\n" +
                "value: Type = " + value.getClass() + ", value = " + value + ";\n" +
                "value: Type = " + key.getClass() + ", value = " + key + ";" +
                '}';
    }
}
