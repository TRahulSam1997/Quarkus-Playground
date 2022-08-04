package LocalCache;

import io.quarkus.cache.CacheResult;

import javax.ws.rs.Path;

@Path("/v1/service")
public class Service {
    @CacheResult(cacheName = "test-cache")
    public String getValye(String key) {
        return "cache value";
    }
}
