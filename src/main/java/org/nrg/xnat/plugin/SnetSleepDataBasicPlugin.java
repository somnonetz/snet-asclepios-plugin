package org.nrg.xnat.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "snet-asclepios-plugin", name = "SNET Asclepios Plugin", description = "Contains schemas for sleepResearchSessionData and encPsgScanData",
        dataModels = {@XnatDataModel(value = "snet02:sleepResearchSessionData",
                                     singular = "Sleep Research Session",
                                     plural = "Sleep Research Sessions",
                                     code = "SRS"),
                      @XnatDataModel(value = "snet02:encPsgScanData",
                                     singular = "PSG Recording",
                                     plural = "PSG Recordings",
                                     code = "PSG")})
public class SnetSleepDataBasicPlugin {
}