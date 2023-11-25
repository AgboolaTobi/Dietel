package mrChibuzo;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CustomArrayList<E> {
    private Object[] storeElement = new Object[10];

    public int size() {
        int counter = 0;
        for (Object element : storeElement) {
            if (element != null)
                counter++;
        }
        return counter;
    }

    public boolean emptyCheck() {
        return size() == 0;
    }


    public int addElement(E element) {
        if (size() == storeElement.length) {
            Object[] newStoreElement = new Object[storeElement.length * 2];
            for (int count = 0; count < storeElement.length; count++) {
                newStoreElement[count] = storeElement[count];
            }
            storeElement = newStoreElement;
        }
        storeElement[size()] = element;
        return size();
    }


    public Object[] removeElementAtCount(Object[] initialArray, int indexToRemove) {
        Object[] newContainer = new Object[initialArray.length - 1];
        for (int count = 0; count < newContainer.length; count++) {
            newContainer[count] = initialArray[count >= indexToRemove ? count + 1 : count];
        }
        return newContainer;
    }

    public int remove(int count) {
        storeElement = removeElementAtCount(storeElement, count);
        return size();
    }

    public void addAll(CustomArrayList<E> element) {

        for (int count = 0; count < element.size(); count++) {
            storeElement[size()] = element.get(count);
        }
    }

    public E get(int count) {

        if (count >= size()) throw new ArrayIndexOutOfBoundsException("Count " + count + " out of bounds.");

        return (E) storeElement[count];
    }

    public int countOf(E element) {

        for (int count = 0; count < size(); count++) {
            if (Objects.equals(storeElement[count], element)) return count;
        }
        return -1;
    }

    public int remove(E element) {
        for (int count = 0; count < size(); count++) {
            if (Objects.equals(storeElement[count], element)) {
                storeElement = removeElementAtCount(storeElement, count);
                break;
            }
        }
        return size();
    }

    public int  lastCountOf(E element){
        for (int count = size() - 1; count >= 0; count--){
            if (Objects.equals(storeElement[count], element))return count;
        }
        return -1;
    }

    public boolean isFoundIn(E elements){
        for (int element = 0; element < size(); element++){
            if (Objects.equals(storeElement[element], elements))
                return true;
        }
        return false;
    }

    public void clear(){
        Arrays.fill(storeElement, null);
    }

    public Object[] toArray(){
        Object[] newArray = new Object[size()];

        for (int count = 0; count < size(); count++){
            newArray[count] = storeElement[count];
        }
        return newArray;
    }

//    public boolean isFoundInAll(CustomArrayList<E> element){
//        for (int count = 0; count < element.size(); count++) {
//            if (storeElement[count] == element.get(count))
//                return true;
//        }
//        return false;
//    }


}