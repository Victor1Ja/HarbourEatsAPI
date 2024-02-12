package org.openapitools.api

import org.openapitools.model.Quest
import org.openapitools.model.QuestInput
import org.openapitools.model.QuestTier
import org.openapitools.model.TierInput
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
class AdminApiController() {

    @Operation(
        summary = "Get all quests",
        operationId = "adminQuestsGet",
        description = """Retrieve a list of all quests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "A list of quests", content = [Content(array = ArraySchema(schema = Schema(implementation = Quest::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/admin/quests"],
        produces = ["application/json"]
    )
    fun adminQuestsGet(): ResponseEntity<List<Quest>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete quest by ID",
        operationId = "adminQuestsIdDelete",
        description = """Delete a specific quest by its ID.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Successfully deleted") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/admin/quests/{id}"]
    )
    fun adminQuestsIdDelete(@Parameter(description = "ID of the quest to delete", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get quest by ID",
        operationId = "adminQuestsIdGet",
        description = """Retrieve details of a specific quest by its ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Details of the quest", content = [Content(schema = Schema(implementation = Quest::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/admin/quests/{id}"],
        produces = ["application/json"]
    )
    fun adminQuestsIdGet(@Parameter(description = "ID of the quest to retrieve", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<Quest> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update quest by ID",
        operationId = "adminQuestsIdPut",
        description = """Update details of a specific quest by its ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successfully updated", content = [Content(schema = Schema(implementation = Quest::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/admin/quests/{id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adminQuestsIdPut(@Parameter(description = "ID of the quest to update", required = true) @PathVariable("id") id: kotlin.Int,@Parameter(description = "", required = true) @Valid @RequestBody questInput: QuestInput): ResponseEntity<Quest> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a new quest",
        operationId = "adminQuestsPost",
        description = """Create and launch a new quest.""",
        responses = [
            ApiResponse(responseCode = "201", description = "Successfully created", content = [Content(schema = Schema(implementation = Quest::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/admin/quests"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adminQuestsPost(@Parameter(description = "", required = true) @Valid @RequestBody questInput: QuestInput): ResponseEntity<Quest> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get all tiers of a quest",
        operationId = "adminQuestsQuestIdTiersGet",
        description = """Retrieve all tiers associated with a specific quest.""",
        responses = [
            ApiResponse(responseCode = "200", description = "A list of tiers", content = [Content(array = ArraySchema(schema = Schema(implementation = QuestTier::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/admin/quests/{quest_id}/tiers"],
        produces = ["application/json"]
    )
    fun adminQuestsQuestIdTiersGet(@Parameter(description = "ID of the quest", required = true) @PathVariable("quest_id") questId: kotlin.Int): ResponseEntity<List<QuestTier>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a new tier for a quest",
        operationId = "adminQuestsQuestIdTiersPost",
        description = """Create a new tier for a specific quest.""",
        responses = [
            ApiResponse(responseCode = "201", description = "Successfully created", content = [Content(schema = Schema(implementation = QuestTier::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/admin/quests/{quest_id}/tiers"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adminQuestsQuestIdTiersPost(@Parameter(description = "ID of the quest", required = true) @PathVariable("quest_id") questId: kotlin.Int,@Parameter(description = "", required = true) @Valid @RequestBody tierInput: TierInput): ResponseEntity<QuestTier> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete tier by ID",
        operationId = "adminQuestsQuestIdTiersTierIdDelete",
        description = """Delete a specific tier by its ID.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Successfully deleted") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/admin/quests/{quest_id}/tiers/{tier_id}"]
    )
    fun adminQuestsQuestIdTiersTierIdDelete(@Parameter(description = "ID of the quest", required = true) @PathVariable("quest_id") questId: kotlin.Int,@Parameter(description = "ID of the tier", required = true) @PathVariable("tier_id") tierId: kotlin.Int): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get tier by ID",
        operationId = "adminQuestsQuestIdTiersTierIdGet",
        description = """Retrieve details of a specific tier by its ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Details of the tier", content = [Content(schema = Schema(implementation = QuestTier::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/admin/quests/{quest_id}/tiers/{tier_id}"],
        produces = ["application/json"]
    )
    fun adminQuestsQuestIdTiersTierIdGet(@Parameter(description = "ID of the quest", required = true) @PathVariable("quest_id") questId: kotlin.Int,@Parameter(description = "ID of the tier", required = true) @PathVariable("tier_id") tierId: kotlin.Int): ResponseEntity<QuestTier> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update tier by ID",
        operationId = "adminQuestsQuestIdTiersTierIdPut",
        description = """Update details of a specific tier by its ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successfully updated", content = [Content(schema = Schema(implementation = QuestTier::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/admin/quests/{quest_id}/tiers/{tier_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adminQuestsQuestIdTiersTierIdPut(@Parameter(description = "ID of the quest", required = true) @PathVariable("quest_id") questId: kotlin.Int,@Parameter(description = "ID of the tier", required = true) @PathVariable("tier_id") tierId: kotlin.Int,@Parameter(description = "", required = true) @Valid @RequestBody tierInput: TierInput): ResponseEntity<QuestTier> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
