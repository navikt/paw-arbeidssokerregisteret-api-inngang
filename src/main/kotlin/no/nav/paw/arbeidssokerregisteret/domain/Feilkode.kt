package no.nav.paw.arbeidssokerregisteret.domain

enum class Feilkode {
    UKJENT_FEIL,
    IKKE_TILGANG_TIL_BRUKER,
    UVENTET_FEIL_MOT_EKSTERN_TJENESTE,
    FEIL_VED_LESING_AV_FORESPORSEL,
    KUNNE_IKKE_AVGJOERE_OM_BRUKER_KAN_REGISTRERES,
    AVVIST,
}