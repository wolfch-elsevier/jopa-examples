import React, {ChangeEvent} from "react";
import {Answer} from "../../model/Record";
import {Col, Form, Row} from "react-bootstrap";

interface AnswerProps {
    show: boolean;
    answer: Answer;
    onChange: (a: Answer) => void;
}

const Answer: React.FC<AnswerProps> = props => {
    const {answer, show, onChange} = props;
    const onAnswerChange = (e: ChangeEvent<HTMLInputElement>) => {
        const newAnswer = Object.assign({}, answer, {has_data_value: e.currentTarget.value});
        onChange(newAnswer);
    };

    if (!show) {
        return null;
    }

    return <Row>
        <Col>
            <Form.Group>
                <Form.Label>Answer</Form.Label>
                <Form.Control type="textarea" value={answer ? answer.has_data_value : ""} onChange={onAnswerChange}/>
            </Form.Group>
        </Col>
    </Row>;
};

export default Answer;
