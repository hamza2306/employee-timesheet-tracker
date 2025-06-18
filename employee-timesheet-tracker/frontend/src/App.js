import React from 'react';
import axios from 'axios';

function App() {
  const checkIn = async () => {
    await axios.post('http://localhost:8080/api/checkin?employeeId=1');
    alert("Checked In!");
  };

  const checkOut = async () => {
    await axios.post('http://localhost:8080/api/checkout?employeeId=1');
    alert("Checked Out!");
  };

  return (
    <div>
      <h1>Employee Timesheet</h1>
      <button onClick={checkIn}>Check In</button>
      <button onClick={checkOut}>Check Out</button>
    </div>
  );
}

export default App;