package api.hm6.configuration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.aeonbits.owner.ConfigCache;
import api.hm6.configuration.StaticVeriables;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConfigProvider {

    public static StaticVeriables staticVeriables() {
        return ConfigCache.getOrCreate(StaticVeriables.class);
    }
}