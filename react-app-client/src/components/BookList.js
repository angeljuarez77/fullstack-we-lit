import React from 'react';
import Book from './Book';

function BookList(props) {
  function nullCheck() {
    if(props.books === null) {
      return (
        <div>
          ... Loading...
        </div>
      )
    }

    return (
      props.books.map(book => <Book
        title={ book.title }
        author={ book.author }
        release={ book.release }
      />)
    )
  }
  return (
    <div>
      { nullCheck() }
    </div>
  )
}

export default BookList;
