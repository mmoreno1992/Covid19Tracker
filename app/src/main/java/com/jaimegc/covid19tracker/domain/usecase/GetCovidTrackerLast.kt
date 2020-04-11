package com.jaimegc.covid19tracker.domain.usecase

import arrow.core.Either
import com.jaimegc.covid19tracker.data.repository.CovidTrackerRepository
import com.jaimegc.covid19tracker.domain.model.CovidTracker
import com.jaimegc.covid19tracker.domain.model.DomainError
import com.jaimegc.covid19tracker.domain.states.State
import com.jaimegc.covid19tracker.domain.states.StateError
import kotlinx.coroutines.flow.Flow

class GetCovidTrackerLast(
    private val repository: CovidTrackerRepository
) {

    fun getCovidTrackerLast(): Flow<Either<StateError<DomainError>, State<CovidTracker>>> =
        repository.getCovidTrackerLast()
}