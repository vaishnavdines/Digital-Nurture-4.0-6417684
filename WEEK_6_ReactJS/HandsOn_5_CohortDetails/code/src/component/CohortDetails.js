import React from "react";
import styles from "./CohortDetails.module.css";

class CohortDetails extends React.Component {
    render() {
        const { cohort } = this.props;

        return (
        <div className={styles.box}>
            <h3 style={{ color: cohort.status === "Ongoing" ? "green" : "blue" }}>
            {cohort.title}
            </h3>

            <dl>
            <dt>Started On</dt>
            <dd>{cohort.startDate}</dd>

            <dt>Current Status</dt>
            <dd>{cohort.status}</dd>

            <dt>Coach</dt>
            <dd>{cohort.coach}</dd>

            <dt>Trainer</dt>
            <dd>{cohort.trainer}</dd>
            </dl>
        </div>
        );
    }
}

export default CohortDetails;
