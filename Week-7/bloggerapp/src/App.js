import React, { useState } from 'react';
import './App.css';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails.js';
import CourseDetails from './CourseDetails';
import { books } from './Data';

function App() {
  const [show, setShow] = useState('all'); 

  return (
    <div className="container">
      <div style={{ textAlign: "center", marginBottom: 20 }}>
      </div>
      {(show === 'all' || show === 'course') && (
        <div className="section">
          <h1>Course Details</h1>
          <CourseDetails />
        </div>
      )}
      {(show === 'all' || show === 'book') && (
        <div className="section border-left">
          <h1>Book Details</h1>
          <BookDetails books={books} />
        </div>
      )}
      {(show === 'all' || show === 'blog') && (
        <div className="section border-left">
          <h1>Blog Details</h1>
          <BlogDetails />
        </div>
      )}
    </div>
  );
}

export default App;