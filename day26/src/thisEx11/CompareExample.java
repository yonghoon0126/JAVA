package thisEx11;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {

		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);

		int result = Objects.compare(s1, s2, new StudentCompartor());
		System.out.println(result);

		result = Objects.compare(s1, s3, new StudentCompartor());
		System.out.println(result);
	}

	// ���� �̳�(��ø) Ŭ����
	static class Student{
		int sno;

		Student(int sno){
			this.sno = sno;
		}
	}

	
	// ���� �̳�(��ø) Ŭ����
	static class StudentCompartor implements Comparator<Student> {	// <>���ʸ�
		@Override
		public int compare(Student a, Student b) {
			if(a.sno < b.sno)
				return -1;
			else if(a.sno == b.sno)
				return 0;
			else
				return 1;
		}
//				return Integer.compare(a.sno, b.sno);
	}

}
