var path = require('path');
var rootPath = path.resolve(__dirname, './src/main/webapp');

module.exports = {
  entry: [
    './src/main/webapp/index.js'
  ],
  output: {
    path: rootPath,
    publicPath: '/',
    filename: 'bundle.js'
  },
  devtool:'source-map',
  module: {
    loaders: [{
      exclude: /node_modules/,
      loader: 'babel',
      query: {
        presets: ['react', 'es2015', 'stage-1']
      }
    }]
  },
  resolve: {
    extensions: ['', '.js', '.jsx']
  },
  devServer: {
    historyApiFallback: true,
    contentBase: './'
  }
};
