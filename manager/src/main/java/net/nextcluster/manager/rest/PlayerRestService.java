package net.nextcluster.manager.rest;

import net.nextcluster.driver.NextCluster;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/players")
public final class PlayerRestService {

    @GetMapping
    public ResponseEntity<Object[]> handle() {
        if (NextCluster.instance().playerProvider() == null) return ResponseEntity.ok(new Object[0]);
        return ResponseEntity.ok(NextCluster.instance().playerProvider().players().toArray());
    }

}
