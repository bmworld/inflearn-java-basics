package garbageCollector;

class MainClass {
	public static void main(String[] args) {

		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();

//		ObjectClass obj3 = new ObjectClass();
		System.out.println("최초의 obj1 :" + obj1);
		System.out.println("최초의 obj2 :" + obj2);
//		System.out.println(" obj1 :" + obj3);

		obj1.getInfo();
		obj1 = null;
		// class의 instance는 해당 객체를 가리키는 "주소"를 가리킨다.
		// ! 따라서, 객체의 주소(레퍼런)에 null을 할당하면, 원래의 객체에 대한 주소가 없으므로, Garbage collector에 의해서
		// 메모리에서 저거가 된다.
		// 따라서, null이 한번 할당된 레퍼런스는 해당 메서드를 불러 올 수 없다.

		// !!!!!!!!!!!!!!!!!!!!!!!!!!!
//		obj1.getInfo(); // <-- !!! nullPointExcepion 에러 발생.
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!
		obj2.getInfo(); // <--레퍼런스가 다르기 때문에, 각기 다른 메모리에 주소가 할당된다. 따라서, nullPointException이 발생하지 않는다.
		 
		// !!!!!!!!!!!!
		obj1 = new ObjectClass(); //새로운 주소를 할당하는 거다. (원래주소가 부활하는게 아님)
		System.out.println("null로 기존주소가 끊어지고 난 뒤, 새로운 1주소가 할당된 >  obj1 :" + obj1);
	}
}
