package org.nrg.xnat.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "snet-asclepios-plugin", name = "SNET Asclepios Plugin", description = "Plugin for using XNAT with ASCLEPIOS services for sleep research",
        dataModels = {@XnatDataModel(value = "snet02:sleepResearchSessionData",
                                     singular = "Sleep Research Session",
                                     plural = "Sleep Research Sessions",
                                     code = "SRS"),
                      @XnatDataModel(value = "snet02:encPsgScanData",
                                     singular = "Encrypted PSG Recording",
                                     plural = "Encrypted PSG Recordings",
                                     code = "PSG")})
public class SnetAsclepiosPlugin {
}