<i>* This report was auto-generated by graphql-http</i>

<h1>GraphQL over HTTP audit report</h1>

<ul>
<li><b>60</b> audits in total</li>
<li><span style="font-family: monospace">✅</span> <b>3</b> pass</li>
<li><span style="font-family: monospace">💡</span> <b>26</b> notices (suggestions)</li>
<li><span style="font-family: monospace">⚠️</span> <b>18</b> warnings (optional)</li>
<li><span style="font-family: monospace">❌</span> <b>13</b> errors (required)</li>
</ul>

<h2>Passing</h2>
<ol>
<li><code>8764</code> MAY use 4xx or 5xx status codes if parameters are invalid</li>
<li><code>865D</code> SHOULD use 4xx or 5xx status codes on document parsing failure when accepting application/graphql-response+json</li>
<li><code>51FE</code> SHOULD use 4xx or 5xx status codes on document validation failure when accepting application/graphql-response+json</li>
</ol>

<h2>Notices</h2>
The server <i>MAY</i> support these, but are truly optional. These are suggestions following recommended conventions.
<ol>
<li><code>5A70</code> MAY accept application/x-www-form-urlencoded formatted GET requests
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "4062",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>9C48</code> MAY NOT allow executing mutations on GET requests
<details>
<summary>Response status is not between 400 and 499</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>9ABE</code> MAY respond with 4xx status code if content-type is not supplied on POST requests
<details>
<summary>Response status is not between 400 and 499</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>A5BF</code> MAY use 400 status code when request body is missing on POST
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>423L</code> MAY use 400 status code on missing {query} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>LKJ0</code> MAY use 400 status code on object {query} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>LKJ1</code> MAY use 400 status code on number {query} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>LKJ2</code> MAY use 400 status code on boolean {query} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>LKJ3</code> MAY use 400 status code on array {query} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>6C00</code> MAY use 400 status code on object {operationName} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>6C01</code> MAY use 400 status code on number {operationName} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>6C02</code> MAY use 400 status code on boolean {operationName} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>6C03</code> MAY use 400 status code on array {operationName} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>4760</code> MAY use 400 status code on string {variables} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>4761</code> MAY use 400 status code on number {variables} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>4762</code> MAY use 400 status code on boolean {variables} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>4763</code> MAY use 400 status code on array {variables} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>D6D5</code> MAY allow URL-encoded JSON string {variables} parameter in GETs when accepting application/graphql-response+json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>6A70</code> MAY allow URL-encoded JSON string {variables} parameter in GETs when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>58B0</code> MAY use 400 status code on string {extensions} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>58B1</code> MAY use 400 status code on number {extensions} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>58B2</code> MAY use 400 status code on boolean {extensions} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>58B3</code> MAY use 400 status code on array {extensions} parameter
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>B6DC</code> MAY use 4xx or 5xx status codes on JSON parsing failure
<details>
<summary>Response status is not between 400 and 499</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>BCF8</code> MAY use 400 status code on JSON parsing failure
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>3E3A</code> MAY use 400 status code if parameters are invalid
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
</ol>

<h2>Warnings</h2>
The server <i>SHOULD</i> support these, but is not required.
<ol>
<li><code>22EB</code> SHOULD accept application/graphql-response+json and match the content-type
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>47DE</code> SHOULD accept */* and use application/json for the content-type
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>80D8</code> SHOULD assume application/json content-type when accept is missing
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>34A2</code> SHOULD allow string {query} parameter when accepting application/graphql-response+json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>8161</code> SHOULD allow string {operationName} parameter when accepting application/graphql-response+json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>94B0</code> SHOULD allow null {variables} parameter when accepting application/graphql-response+json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>94B1</code> SHOULD allow null {operationName} parameter when accepting application/graphql-response+json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>94B2</code> SHOULD allow null {extensions} parameter when accepting application/graphql-response+json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>2EA1</code> SHOULD allow map {variables} parameter when accepting application/graphql-response+json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>428F</code> SHOULD allow map {extensions} parameter when accepting application/graphql-response+json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>572B</code> SHOULD use 200 status code on document parsing failure when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>FDE2</code> SHOULD use 200 status code on document validation failure when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>7B9B</code> SHOULD use a status code of 200 on variable coercion failure when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>556A</code> SHOULD use 400 status code on document parsing failure when accepting application/graphql-response+json
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>D586</code> SHOULD not contain the data entry on document parsing failure when accepting application/graphql-response+json
<details>
<summary>Response body is not valid JSON</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>74FF</code> SHOULD use 400 status code on document validation failure when accepting application/graphql-response+json
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>5E5B</code> SHOULD not contain the data entry on document validation failure when accepting application/graphql-response+json
<details>
<summary>Response body is not valid JSON</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
<li><code>86EE</code> SHOULD use a status code of 400 on variable coercion failure when accepting application/graphql-response+json
<details>
<summary>Response status code is not 400</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": null
}
</code></pre>
</details>
</li>
</ol>

<h2>Errors</h2>
The server <b>MUST</b> support these.
<ol>
<li><code>4655</code> MUST accept application/json and match the content-type
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>82A3</code> MUST use utf-8 encoding when responding
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>BF61</code> MUST accept utf-8 encoded request
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>78D5</code> MUST assume utf-8 in request if encoding is unspecified
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>2C94</code> MUST accept POST requests
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3992",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>03D4</code> MUST accept application/json POST requests
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "text/html;charset=iso-8859-1",
    "content-length": "3428",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": "<html omitted>"
}
</code></pre>
</details>
</li>
<li><code>13EE</code> MUST allow string {query} parameter when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>B8B3</code> MUST allow string {operationName} parameter when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>0220</code> MUST allow null {variables} parameter when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>0221</code> MUST allow null {operationName} parameter when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>0222</code> MUST allow null {extensions} parameter when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>28B9</code> MUST allow map {variables} parameter when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
<li><code>1B7A</code> MUST allow map {extensions} parameter when accepting application/json
<details>
<summary>Response status code is not 200</summary>
<pre><code class="lang-json">{
  "statusText": "Server Error",
  "status": 500,
  "headers": {
    "server": "Jetty(11.0.20)",
    "date": "<timestamp>",
    "content-type": "application/json",
    "content-length": "256",
    "connection": "close",
    "cache-control": "must-revalidate,no-cache,no-store"
  },
  "body": {
    "url": "/graphql",
    "status": "500",
    "servlet": "org.eclipse.jetty.servlet.ServletHandler$Default404Servlet-4e09c3b0",
    "message": "java.lang.AssertionError: Assert failed: (string? query)",
    "cause0": "java.lang.AssertionError: Assert failed: (string? query)"
  }
}
</code></pre>
</details>
</li>
</ol>