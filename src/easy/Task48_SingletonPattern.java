package easy;

public class Task48_SingletonPattern {

//    class Singleton {
//        private static Singleton single_instance = null;
//        public static String str;
//
//        private Singleton() {
//        }
//
//        public static Singleton getSingleInstance() {
//            if (single_instance == null) {
//                single_instance = new Singleton();
//            }
//
//            return single_instance;
//        }
//    }

}
class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){

    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}