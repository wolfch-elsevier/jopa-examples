import {combineReducers} from "redux";
import AppModel from "../model/AppModel";
import ActionType, {AsyncActionSuccess} from "../action/ActionType";
import AsyncActionStatus from "../action/AsyncActionStatus";
import {Report} from "../model/Report";
import Event from "../model/Event";
import {Question} from "../model/Record";

function settings(state: { [key: string]: string } = {}, action: AsyncActionSuccess<{ [key: string]: string }>): { [key: string]: string } {
    switch (action.type) {
        case ActionType.LOAD_SETTINGS:
            if (action.status === AsyncActionStatus.SUCCESS) {
                return action.payload;
            }
            return state;
        default:
            return state;
    }
}

function properties(state: string[] = [], action: AsyncActionSuccess<string[]>) {
    if (action.type === ActionType.LOAD_PROPERTIES && action.status === AsyncActionStatus.SUCCESS) {
        return action.payload;
    }
    return state;
}

function reports(state: Report[] = [], action: AsyncActionSuccess<Report[]>) {
    switch (action.type) {
        case ActionType.SAVE_SETTINGS:
            return [];
        case ActionType.LOAD_REPORTS:
            return action.status === AsyncActionStatus.SUCCESS ? action.payload : state;
        default:
            return state;
    }
}

function audits(state: Event[] = [], action: AsyncActionSuccess<Event[]>) {
    if (action.type === ActionType.LOAD_AUDITS && action.status === AsyncActionStatus.SUCCESS) {
        return action.payload;
    }
    return state;
}

function questions(state: Question[] = [], action: AsyncActionSuccess<Question[]>) {
    if (action.type === ActionType.LOAD_QUESTIONS && action.status === AsyncActionStatus.SUCCESS) {
        return action.payload;
    }
    return state;
}

const rootReducer = combineReducers<AppModel>({audits, properties, questions, reports, settings});

export default rootReducer;
