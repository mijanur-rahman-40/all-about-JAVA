package InterfacesChallengePart_2_4;

import java.util.List;

public interface iSaveable {
    List<String> write();
    void read(List<String> saveValues);
}
