package com.hartwig.rna.shearwater;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class ShearwaterApplication {

    private static final Logger LOGGER = LogManager.getLogger(ShearwaterApplication.class);

    private static final String APPLICATION = "RNA Shearwater";
    private static final String VERSION = ShearwaterApplication.class.getPackage().getImplementationVersion();

    public static void main(@NotNull String... args) {
        LOGGER.info("Running {} v{}", APPLICATION, VERSION);
    }
}
