import React from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

function App() {
  async function call() {
    // The api endpoint that returns a list of books
    const res = await axios.get('http://localhost:8080/books');
    console.log(res.data);
  }
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <button onClick={ () => call() }>Log Books</button>
    </div>
  );
}

export default App;
