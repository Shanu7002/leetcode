import java.util.HashMap;
import java.util.UUID;

interface AlertDAO {
    UUID addAlert(String description);
    String getAlert(UUID id);
}

class MapAlertDAO implements AlertDAO {
    private final HashMap<UUID, String> alerts = new HashMap<>();

    @Override
    public UUID addAlert(String description) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, description);
        return id;
    }

    @Override
    public String getAlert(UUID id) {
        return this.alerts.get(id);
    }
}

public class AlertService{
    private final AlertDAO storage;

    public AlertService(AlertDAO storage) {
        this.storage = storage;
    }

    public UUID raiseAlert() {
        return this.storage.addAlert("Alerta de Segurança Axur");
    }

    public String getAlert(UUID id) {
        return this.storage.getAlert(id);
    }
}