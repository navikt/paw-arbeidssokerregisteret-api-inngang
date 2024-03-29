package no.nav.paw.arbeidssokerregisteret.application

enum class RegelId {
    IKKE_FUNNET,
    SAVNET,
    DOED,
    ENDRE_FOR_ANNEN_BRUKER,
    ANSATT_IKKE_TILGANG_TIL_BRUKER,
    IKKE_TILGANG,
    UNDER_18_AAR,
    IKKE_BOSATT_I_NORGE_I_HENHOLD_TIL_FOLKEREGISTERLOVEN,
    FORHAANDSGODKJENT_AV_ANSATT,
    OVER_18_AAR_OG_BOSATT_ETTER_FREG_LOVEN,
    ANSATT_HAR_TILGANG_TIL_BRUKER,
    ENDRE_EGEN_BRUKER,
    UKJENT_ALDER,
    IKKE_ANSATT_OG_FORHAANDSGODKJENT_AV_ANSATT;

    val eksternRegelId: EksternRegelId?
        get() = try {
            EksternRegelId.valueOf(name)
        } catch (e: IllegalArgumentException) {
            null
        }
}

enum class EksternRegelId {
    UKJENT_REGEL,
    IKKE_FUNNET,
    SAVNET,
    DOED,
    ENDRE_FOR_ANNEN_BRUKER,
    ANSATT_IKKE_TILGANG_TIL_BRUKER,
    IKKE_TILGANG,
    UNDER_18_AAR,
    IKKE_BOSATT_I_NORGE_I_HENHOLD_TIL_FOLKEREGISTERLOVEN,
    UKJENT_ALDER,
    IKKE_ANSATT_OG_FORHAANDSGODKJENT_AV_ANSATT
}
