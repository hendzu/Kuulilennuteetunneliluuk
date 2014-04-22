import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class KeradeKasitleja {
	private final static ArrayList<Kerad> OBJEKTID = new ArrayList<>();
	private final static Set<Kerad> KUSTUTATAVAD = new HashSet<>();

	public static ArrayList<Kerad> getKoikKerad() {
		return OBJEKTID;
	}

	public void lisaKerad(Kerad kera) {
		OBJEKTID.addAll(Arrays.asList(kera));
	}

	public static Set<Kerad> getCleanup() {
		return KUSTUTATAVAD;
	}

	public void lisaKustutatav(Kerad kera) {
		kera.getAsCircle().setVisible(false);
		KUSTUTATAVAD.add(kera);

	}

	public void cleanUp() {
		OBJEKTID.removeAll(KUSTUTATAVAD);
		KUSTUTATAVAD.clear();

	}


}
