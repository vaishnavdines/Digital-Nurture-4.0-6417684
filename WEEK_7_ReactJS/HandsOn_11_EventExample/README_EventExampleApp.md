
# ⚡ Event Example App - React Hands-On

A React app demonstrating how to handle various types of **events** in class components, including:
- Button clicks
- Alert messages
- Synthetic events
- Form inputs and submission

Includes a built-in **Currency Converter** using controlled components.

> 💡 **Author**: Vaishnav Dinesh

---

## 📁 Project Structure

```
EventExampleApp/
│
├── src/
│   ├── App.js
│   └── CurrencyConvertor.js
└── README.md
```

---

## 🔹 App Component

**File:** `App.js`

Handles different events using class methods:

```jsx
import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };
  }

  increment = () => {
    this.setState(prev => ({ count: prev.count + 1 }));
  }

  sayHello = () => {
    alert("Hello! Member1");
  }

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  }

  decrement = () => {
    this.setState(prev => ({ count: prev.count - 1 }));
  }

  sayWelcome = (msg) => {
    alert(msg);
  }

  handleSynthetic = () => {
    alert("I was clicked");
  }

  render() {
    return (
      <div style={{ textAlign: 'left', marginLeft: '20px', fontFamily: 'Arial' }}>
        <h3>{this.state.count}</h3>
        <button onClick={this.handleIncrement}>Increment</button>
        <br /><br />
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("welcome")}>Say welcome</button>
        <br /><br />
        <button onClick={this.handleSynthetic}>Click on me</button>
        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
```

---

## 🔹 CurrencyConvertor Component

**File:** `CurrencyConvertor.js`

Handles form input and performs conversion:

```jsx
import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      result: ''
    };
  }

  handleChange = (e) => {
    this.setState({ amount: e.target.value });
  }

  handleSubmit = () => {
    const result = parseFloat(this.state.amount) * 80;
    alert(`Converting to Euro Amount is ${result}`);
    this.setState({ result });
  }

  render() {
    return (
      <div style={{ fontFamily: 'Arial', marginTop: '30px' }}>
        <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
        <form>
          <label>Amount: </label>
          <input type="text" value={this.state.amount} onChange={this.handleChange} />
          <br /><br />
          <label>Currency: </label>
          <textarea value="Euro" readOnly />
          <br /><br />
          <button type="button" onClick={this.handleSubmit}>Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
```

---

## 🚀 How to Run

```bash
npm install
npm start
```

App runs at: `http://localhost:3000`

---

## 👨‍💻 Author

Built with 💡 by **Vaishnav Dinesh**
