import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.AfficheManager;

public class AfficheManagerTest {

    @Test
    public void addAndShowInOrder() {
        AfficheManager manager = new AfficheManager();
        manager.add("kino1");
        manager.add("kino2");
        manager.add("kino3");

        String[] expected = {"kino1", "kino2", "kino3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseOverLimitForEnterLimit() {
        AfficheManager manager = new AfficheManager(5);
        manager.add("kino1");
        manager.add("kino2");
        manager.add("kino3");
        manager.add("kino4");
        manager.add("kino5");
        manager.add("kino6");

        String[] expected = {"kino6", "kino5", "kino4", "kino3", "kino2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseUnderLimitForEnterLimit() {
        AfficheManager manager = new AfficheManager(5);
        manager.add("kino1");
        manager.add("kino2");
        manager.add("kino3");
        manager.add("kino4");

        String[] expected = {"kino4", "kino3", "kino2", "kino1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseLimitForEnterLimit() {
        AfficheManager manager = new AfficheManager(5);
        manager.add("kino1");
        manager.add("kino2");
        manager.add("kino3");
        manager.add("kino4");
        manager.add("kino5");

        String[] expected = {"kino5", "kino4", "kino3", "kino2", "kino1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseZeroForEnterLimit() {
        AfficheManager manager = new AfficheManager(5);

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseUnderLimit() {
        AfficheManager manager = new AfficheManager();
        manager.add("kino1");
        manager.add("kino2");
        manager.add("kino3");

        String[] expected = {"kino3", "kino2", "kino1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseLastOverLimit() {
        AfficheManager manager = new AfficheManager();
        manager.add("kino1");
        manager.add("kino2");
        manager.add("kino3");
        manager.add("kino4");
        manager.add("kino5");
        manager.add("kino6");
        manager.add("kino7");
        manager.add("kino8");
        manager.add("kino9");
        manager.add("kino10");
        manager.add("kino11");

        String[] expected = {"kino11", "kino10", "kino9", "kino8", "kino7", "kino6", "kino5", "kino4", "kino3", "kino2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseLastForUnderLimit() {
        AfficheManager manager = new AfficheManager();
        manager.add("kino1");
        manager.add("kino2");
        manager.add("kino3");
        manager.add("kino4");
        manager.add("kino5");
        manager.add("kino6");
        manager.add("kino7");
        manager.add("kino8");
        manager.add("kino9");
        manager.add("kino10");
        manager.add("kino11");

        String[] expected = {"kino11", "kino10", "kino9", "kino8", "kino7", "kino6", "kino5", "kino4", "kino3", "kino2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseZero() {
        AfficheManager manager = new AfficheManager();


        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
