server {
    listen {{ .port }} default_server;

    include /etc/nginx/includes/server_params.conf;
    include /etc/nginx/includes/proxy_params.conf;

    location /api {
        proxy_pass http://backend{{ .entry }}/api;
    }

    location /fw {
        proxy_pass http://backend{{ .entry }}/fw;
    }

    location /fw/hcu {
        proxy_pass http://backend{{ .entry }}/fw/hcu;
    }

    # Read-only JSON API for Home Assistant sensors; changes go through the panel
    location /thermostat/ {
        limit_except GET {
            deny all;
        }
        proxy_pass http://backend{{ .entry }}/thermostat/;
    }

}
