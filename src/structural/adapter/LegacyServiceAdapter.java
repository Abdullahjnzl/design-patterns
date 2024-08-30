package structural.adapter;

// Adapter that adapts LegacyService to TargetService
public class LegacyServiceAdapter implements TargetService {
    private LegacyService legacyService;

    public LegacyServiceAdapter(LegacyService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public String getData() {
        // Convert legacy data to the target format
        return "Adapted " + legacyService.getLegacyData();
    }
}
