package QoS.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Availability = 0;
  public static final int CapabilitiesProfile = 1;
  public static final int Capability = 2;
  public static final int DataRate = 3;
  public static final int Deadline = 4;
  public static final int Delay = 5;
  public static final int Depth = 6;
  public static final int Durability = 7;
  public static final int ErrorRate = 8;
  public static final int History = 9;
  public static final int Jitter = 10;
  public static final int LeaseDuration = 11;
  public static final int Lifespan = 12;
  public static final int Liveliness = 13;
  public static final int LossRate = 14;
  public static final int QoSDefinition = 15;
  public static final int Reliability = 16;
  public static final int Requirement = 17;
  public static final int RequirementsProfile = 18;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x6d22281353ea440eL, 0xba3023ced4b723f0L);
    builder.put(0x6f2f11a0135ba270L, Availability);
    builder.put(0x75d27ff7603f6d14L, CapabilitiesProfile);
    builder.put(0x75d27ff7603f6d17L, Capability);
    builder.put(0x6f2f11a0135ba26dL, DataRate);
    builder.put(0x6f2f11a0135ba267L, Deadline);
    builder.put(0x6f2f11a0135ba26cL, Delay);
    builder.put(0x6f2f11a0135ba264L, Depth);
    builder.put(0x6f2f11a0135ba266L, Durability);
    builder.put(0x6f2f11a0135ba26fL, ErrorRate);
    builder.put(0x6f2f11a0135ba263L, History);
    builder.put(0x6f2f11a0135ba26bL, Jitter);
    builder.put(0x6f2f11a0135ba26aL, LeaseDuration);
    builder.put(0x6f2f11a0135ba268L, Lifespan);
    builder.put(0x6f2f11a0135ba269L, Liveliness);
    builder.put(0x6f2f11a0135ba26eL, LossRate);
    builder.put(0x57f420665365fe0L, QoSDefinition);
    builder.put(0x6f2f11a0135ba265L, Reliability);
    builder.put(0x4bc2f2a09e3d0ef1L, Requirement);
    builder.put(0xdbe2d924f785bbaL, RequirementsProfile);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}