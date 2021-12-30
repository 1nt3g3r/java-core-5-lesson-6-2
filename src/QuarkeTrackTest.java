import java.util.Arrays;
import java.util.Objects;

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5}; //9
        int[] track2Data = {3, 5, 4}; //12
        int[] track3Data = {1, 5, 3}; //9
        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);
//false
        System.out.println(track1.equals(track2));
//true
        System.out.println(track1.equals(track3));
//Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());
//true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}



//3, 4, 1 - track 1 - sum = 8
//3, 5 - track 2 - sum = 8
class QuarkeTrack {
    private final int[] lines;
    private final int sum;

    public QuarkeTrack(int[] lines) {
        this.lines = Arrays.copyOf(lines, lines.length);

        int sum = 0;
        for (int line : lines) {
            sum += line;
        }

        //equals to code higher
//        for(int i = 0; i < lines.length; i++) {
//            int line = lines[i];
//            sum += line;
//        }

        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (!(o instanceof QuarkeTrack)) {
            return false;
        }

        QuarkeTrack quarkeTrack = (QuarkeTrack) o;
        return sum == quarkeTrack.sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum);
    }
}