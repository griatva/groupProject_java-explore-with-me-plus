package ru.practicum.ewm.main.dto.params;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventParamsPublic {

    private String text;              // text to search in the annotation and detailed event description

    private List<Long> categories;    // list of category IDs to search within

    private Boolean paid;             // search only paid or free events

    private String rangeStart;        // date and time not earlier than which the event should occur

    private String rangeEnd;          // date and time not later than which the event should occur

    private boolean onlyAvailable = false; // only events with available participation slots

    private String sort;              // sorting option: by event date or by number of views

    @PositiveOrZero
    private Integer from = PaginationDefaults.DEFAULT_FROM; // number of events to skip // default value: 0

    @Positive
    private Integer size = PaginationDefaults.DEFAULT_SIZE; // number of events in the result set // default value: 10
}