import React, { Component}  from 'react';
import ReactDOM from 'react-dom';

export default class App extends Component {
	render() {
		return (<div className="test">
				<p>Hello {this.props.name}!</p>
				</div>);
	}
}

ReactDOM.render(<App name="lysh" />, document.getElementById('app'));
