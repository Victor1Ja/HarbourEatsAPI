package org.openapitools.api

import org.openapitools.model.CourierQuestProgress
import org.openapitools.model.Quest
import org.openapitools.model.QuestParticipationHistory
import org.openapitools.model.RewardClaimInput
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class CourierApiController() {

    @Operation(
        summary = "Get courier's quests",
        operationId = "courierQuestsGet",
        description = """Retrieve all quests assigned to the courier.""",
        responses = [
            ApiResponse(responseCode = "200", description = "A list of quests", content = [Content(array = ArraySchema(schema = Schema(implementation = Quest::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/courier/quests"],
        produces = ["application/json"]
    )
    fun courierQuestsGet(): ResponseEntity<List<Quest>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get courier's quest participation history",
        operationId = "courierQuestsQuestIdHistoryGet",
        description = """Retrieve participation history of the courier for a specific quest.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Courier's quest participation history", content = [Content(array = ArraySchema(schema = Schema(implementation = QuestParticipationHistory::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/courier/quests/{quest_id}/history"],
        produces = ["application/json"]
    )
    fun courierQuestsQuestIdHistoryGet(@Parameter(description = "ID of the quest", required = true) @PathVariable("quest_id") questId: kotlin.Int): ResponseEntity<List<QuestParticipationHistory>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get quest progress for a courier",
        operationId = "courierQuestsQuestIdProgressGet",
        description = """Retrieve the progress of a specific quest for the courier.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Courier's quest progress", content = [Content(schema = Schema(implementation = CourierQuestProgress::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/courier/quests/{quest_id}/progress"],
        produces = ["application/json"]
    )
    fun courierQuestsQuestIdProgressGet(@Parameter(description = "ID of the quest", required = true) @PathVariable("quest_id") questId: kotlin.Int): ResponseEntity<CourierQuestProgress> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Claim rewards",
        operationId = "courierRewardsPost",
        description = """Claim rewards earned by the courier.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Rewards claimed successfully") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/courier/rewards"],
        consumes = ["application/json"]
    )
    fun courierRewardsPost(@Parameter(description = "", required = true) @Valid @RequestBody rewardClaimInput: RewardClaimInput): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
