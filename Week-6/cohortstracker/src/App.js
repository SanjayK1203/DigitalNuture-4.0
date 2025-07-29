import React from "react";
import CohortDetails from "./components/CohortDetails"; 

const cohorts = [
  {
    id: "INTADMDF10",
    type: ".NET FSD",
    startDate: "22-Feb-2022",
    status: "Scheduled",
    coach: "Aathma",
    trainer: "Jojo Jose",
  },
  {
    id: "ADM21JF014",
    type: "Java FSD",
    startDate: "10-Sep-2021",
    status: "Ongoing",
    coach: "Apoorp",
    trainer: "Elisa Smith",
  },
  {
    id: "CDBJF21025",
    type: "Java FSD",
    startDate: "24-Dec-2021",
    status: "Ongoing",
    coach: "Aathma",
    trainer: "John Doe",
  },
];

const App = () => {
  return (
    <div>
      <h2>Cohorts Details</h2>
      {cohorts.map((cohort, idx) => (
        <CohortDetails key={idx} cohort={cohort} />
      ))}
    </div>
  );
};

export default App;