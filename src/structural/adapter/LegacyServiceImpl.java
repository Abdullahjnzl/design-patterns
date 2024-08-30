package structural.adapter;

// Concrete implementation of LegacyService
public class LegacyServiceImpl implements LegacyService {
    @Override
    public String getLegacyData() {
        return "Legacy Data";
    }
}