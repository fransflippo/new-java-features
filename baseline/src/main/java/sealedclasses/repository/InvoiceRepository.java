package sealedclasses.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InvoiceRepository {

    private Map<String, InvoiceEntity> entities = new HashMap<>();

    public void save(InvoiceEntity entity) {
        entities.put(entity.getId(), entity);
    }

    public Collection<InvoiceEntity> findAll() {
        return entities.values();
    }
}
