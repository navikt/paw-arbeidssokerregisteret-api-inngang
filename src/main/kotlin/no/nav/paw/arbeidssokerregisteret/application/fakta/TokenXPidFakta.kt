package no.nav.paw.arbeidssokerregisteret.application.fakta

import no.nav.paw.arbeidssokerregisteret.RequestScope
import no.nav.paw.arbeidssokerregisteret.application.Fakta
import no.nav.paw.arbeidssokerregisteret.domain.Identitetsnummer
import no.nav.paw.arbeidssokerregisteret.utils.TokenXPID

context(RequestScope)
fun tokenXPidFakta(identitetsnummer: Identitetsnummer): Fakta {
    return claims[TokenXPID]?.let { authenticatedUser ->
        if (authenticatedUser != identitetsnummer) {
            Fakta.IKKE_SAMME_SOM_INNLOGGER_BRUKER
        } else {
            Fakta.SAMME_SOM_INNLOGGET_BRUKER
        }
    } ?: Fakta.TOKENX_PID_IKKE_FUNNET
}