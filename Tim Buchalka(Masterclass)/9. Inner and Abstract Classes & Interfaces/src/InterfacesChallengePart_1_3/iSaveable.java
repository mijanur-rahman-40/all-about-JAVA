package InterfacesChallengePart_1_3;

import java.util.List;

public interface iSaveable {
    List<String> write();
    void read(List<String> saveValues);
}
