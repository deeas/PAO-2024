package exceptions;

import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        try {
            thisAlwaysThrowsException();
        } catch (RuntimeException e) {
            System.out.println("First catch");
        } catch (Exception e) {
            System.out.println("Second catch");
            e.printStackTrace();
        }

    }

    public static void thisAlwaysThrowsException() throws Exception {
        List<String> list = getList();

        if (list == null) {
            throw new Exception("List is null");
        }

        if (list.isEmpty()) {
            throw new RuntimeException("List is empty");
        }
    }

    private static List<String> getList() {
        return null;
    }
}
