import React from 'react';
import './App.css';
import axios from 'axios';
import BookList from './components/BookList';

const BASE_URL = 'https://books-api-for-per-scholas.herokuapp.com/';

class App extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      books: null,
    }
  }

  componentDidMount() {
    this.listBooks();
  }

  async listBooks() {
    try {
      // https://books-api-for-per-scholas.herokuapp.com/books
      const res = await axios.get(BASE_URL + 'books');
      this.setState({ books: res.data })
    } catch(e) {
      console.error(e, e.message);
    }
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <BookList books={ this.state.books } />
        </header>
      </div>
    );
  }
}

export default App;
