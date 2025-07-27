import './App.css';
import { CohortsData } from './Cohort';
import CohortDetails from './component/CohortDetails';

function App() {
  return (
    <div>
      <h1>Cohorts Details</h1>
      {CohortsData.map(cohort =>
        <CohortDetails key={cohort.id} cohort={cohort} />
      )}
    </div>
  );
}

export default App;
