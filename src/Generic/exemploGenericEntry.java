package Generic;

public class exemploGenericEntry {

    public static void main(String[] args) {
        GenericEntry<String, Long> entry = new GenericEntry<String, Long>( "Teste", 10l);
        System.out.println(entry.getData() + " " + entry.getCodigo());

        GenericEntry<Long, Integer> entryLong = new GenericEntry<Long, Integer>( 10l, 11);
        System.out.println(entryLong.getData() + " " + entryLong.getCodigo());
    }
}
