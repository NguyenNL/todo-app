'use strict';

const CleanWebpackPlugin   = require('clean-webpack-plugin');
const HtmlWebpackPlugin    = require('html-webpack-plugin');

const helpers              = require('./helpers');
const isDev                = process.env.NODE_ENV !== 'production';

module.exports = {
    entry: {
        // vendor: './src/vendor.ts',
        polyfills: './src/main/webapp/polyfills.ts',
        main: isDev ? './src/main/webapp/main.ts' : './src/main/webapp/main.aot.ts',
        global: './src/main/webapp/content/scss/global.scss'
    },

    resolve: {
        extensions: ['.ts', '.js']
    },

    module: {
        rules: [
            {
                test: /\.html$/,
                loader: 'html-loader'
            }
        ]
    },

    plugins: [
        new CleanWebpackPlugin(
          helpers.root('target/classes/static/'), { root: helpers.root(), verbose: true }),

        new HtmlWebpackPlugin({
            template: 'src/main/webapp/index.html'
        })
    ]
};
