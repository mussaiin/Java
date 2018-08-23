package task9;

import java.util.Comparator;
public class Test20_21 {
    public static void main(String[] args) {
        GeometricObject[] list = { new Circle(5), new Rectangle(4, 5), new Circle(5.5), new Rectangle(2.4, 5), 
                                   new Circle(0.5), new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
                                   new Circle(6.5), new Rectangle(4, 5)};
        for (GeometricObject o : list) {
            System.out.println(o.getArea()+"");
        }
        selectionSort(list, new GeometricObjectComparator());
        
        System.out.println("sorted:");
        for (GeometricObject o : list) {
            System.out.println(o.getArea()+"");
        }
        
    }
    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator){
            for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			E currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (comparator.compare(currentMin, list[j]) > 0) {
				currentMin = list[j];
				currentMinIndex = j;
			}
		}

		// Swap list[i] with list[currentMinIndex] if necessary
		if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}	
    }
}
